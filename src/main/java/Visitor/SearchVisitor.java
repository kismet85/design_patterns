package Visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchPattern;
    private List<File> foundFiles = new ArrayList<>();

    public SearchVisitor(String searchPattern) {
        this.searchPattern = searchPattern;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchPattern)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {

    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }
}
