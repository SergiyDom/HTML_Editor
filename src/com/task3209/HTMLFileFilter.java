package com.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.Locale;

public class HTMLFileFilter extends FileFilter {

    @Override
    public boolean accept(File file) {
        return file.isDirectory() ||
                file.getName().toLowerCase(Locale.ROOT).endsWith(".html") ||
                file.getName().toLowerCase(Locale.ROOT).endsWith(".htm");
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
