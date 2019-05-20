package me.ahtksp.projectman;

import javax.annotation.Nonnull;
import java.util.Collection;

/**@author AHTKSP - Magyar Dávid*/
public interface IContributor {

    @Nonnull String getDisplayName();

    @Nonnull String getEmail();

    @Nonnull Collection<IProject> collectProjects();

}
