package se.lofmark.dao;

import se.lofmark.AppUser;

import java.util.List;

public interface AppUserDAO {

    AppUser persist (AppUser appUser);

    AppUser findByUsername (String userName);

    List<AppUser> findAll();

    AppUser remove (AppUser appUser);
}
