package model;

import exception.CustomException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sabi on 25/06/2017.
 */
public class ConfigFileReader {

    private DataStructuresModel dataStructuresModel;

    public ConfigFileReader() {

        dataStructuresModel = new DataStructuresModel();
    }

    public void readLines(String configFilePath) throws IOException {

        try(BufferedReader br
                = new BufferedReader(new FileReader(configFilePath))) {

            String line;
            while((line = br.readLine()) != null) {
                String[] eachLine = line.split("=");
                for(String str : eachLine) {
                    System.out.println(str.trim());
                }
                dataStructuresModel.setConfigParameters(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new CustomException("Invalid configuration file was added!");
        }

/*        for(String line : dataStructuresModel.getConfigFileContent()) {
            String[] eachLine = line.split("=");
            int i = 1;
            for(String str : eachLine) {
                System.out.println(i++ + "line: " + str.trim());
            }
        }*/

    }
}
