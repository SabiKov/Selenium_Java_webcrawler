package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sabi on 25/06/2017.
 */
public class DataStructuresModel implements GettingDataStructure, SettingDataStructure {

    private List<String> configParameters = new ArrayList<>();

    @Override
    public void setConfigParameters(String line) {
        configParameters.add(line);
    }

    @Override
    public List<String> getConfigFileContent() {
        return configParameters;
    }

    @Override
    public Map<String, String> getConfigValues() {
        return null;
    }

    @Override
    public List<String> getTeamCityPath() {
        return null;
    }

    @Override
    public List<String> getCommitedFileNames() {
        return null;
    }

    @Override
    public Set<List> getOrderedCommitedFileNames() {
        return null;
    }
}
