package me.ahtksp.projectman;

import javax.annotation.Nonnull;
import javax.ws.rs.core.Application;

/**@author AHTKSP - Magyar Dávid*/
public class ProjectsApp extends Application {

    public static void testLib() {
        @Nonnull Object testObj = new Object();
        @Nonnull Object testWrong = null;
    }

}
