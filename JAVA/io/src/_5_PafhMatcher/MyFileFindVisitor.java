package _5_PafhMatcher;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileFindVisitor extends SimpleFileVisitor<Path> {
    private PathMatcher matcher;
    public MyFileFindVisitor(String pattern) {
        try {
            matcher = FileSystems.getDefault().getPathMatcher(pattern);
        } catch (IllegalArgumentException iae) {
            System.err.println("Invalid pattern; did you forget to prefix \"glob:\" or \"regex:\"?");
            System.exit(1);
        }
    }
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
        find(path);
        return FileVisitResult.CONTINUE;
    }
    private void find(Path path) {
        Path name = path.getFileName();
        if (matcher.matches(name)){
            System.out.println("Matching file: " + path.getFileName());
        }
    }
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        find(path);
            return FileVisitResult.CONTINUE;
    }
}
