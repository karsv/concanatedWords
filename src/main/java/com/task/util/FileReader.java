package com.task.util;

import com.task.exception.DataProcessingException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public List<String> readFromFileToList(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new DataProcessingException("Something was wrong while reading the file", e);
        }
    }
}
