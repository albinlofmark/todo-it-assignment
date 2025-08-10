package se.lofmark;

import se.lofmark.impl.TodoItemDAOCollection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AppUser user1 = AppUser.getInstance("albin.lofmark", "abcdef123456", AppRole.ROLE_APP_USER);
        AppUser user2 = AppUser.getInstance("greger.karlsson", "zxy999ap!", AppRole.ROLE_APP_ADMIN);

        Person albin = Person.createPerson("Albin", "Löfmark", "albin.lofmark@email.com", user1);
        Person greger = Person.createPerson("Greger", "Karlsson", "greger.karlsson@email.com", user2);

        TodoItemDAOCollection dao = new TodoItemDAOCollection();

        TodoItem task1 = new TodoItem("Mow the lawn", "Mow the lawn and trim the edges", LocalDate.now().plusDays(2), albin);
        TodoItem task2 = new TodoItem("Develop Battlefield 6", "Develop the entire backend for Battlefield 6", LocalDate.now().plusDays(365), greger);

        task1.setDone(true);

        dao.persist(task1);
        dao.persist(task2);

        System.out.println("\nFind by ID 1:");
        System.out.println(dao.findById(task1.getId()));

        System.out.println("\nAll tasks:");
        dao.findAll().forEach(System.out::println);

        System.out.println("\nTasks that are DONE:");
        dao.findAllByDoneStatus(true).forEach(System.out::println);

        System.out.println("\nTasks that are NOT done:");
        dao.findAllByDoneStatus(false).forEach(System.out::println);

        System.out.println("\nTasks containing 'lawn':");
        dao.findByTitleContains("lawn").forEach(System.out::println);

        System.out.println("\nTasks created by Albin:");
        dao.findByPersonId(albin.getId()).forEach(System.out::println);

        System.out.println("\nTasks with deadline before 5 days from now:");
        dao.findByDeadlineBefore(LocalDate.now().plusDays(5)).forEach(System.out::println);

        System.out.println("\nTasks with deadline after today:");
        dao.findByDeadlineAfter(LocalDate.now()).forEach(System.out::println);

        System.out.println("\nRemoving task 2 (Prepare report)");
        dao.remove(task2.getId());

        System.out.println("\nAll tasks after removal:");
        dao.findAll().forEach(System.out::println);
    }
}