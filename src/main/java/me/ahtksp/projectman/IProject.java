package me.ahtksp.projectman;

import javax.validation.constraints.NotNull;
import java.util.Collection;

/**@author AHTKSP - Magyar Dávid*/
public interface IProject {

    @NotNull Collection<IContributor> getContributors();

}
