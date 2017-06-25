package model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sabi on 25/06/2017.
 */
public interface GettingDataStructure {


    List<String> getConfigFileContent();
    Map<String, String> getConfigValues();
    List<String> getTeamCityPath();
    List<String> getCommitedFileNames();
    Set<List> getOrderedCommitedFileNames();


}
