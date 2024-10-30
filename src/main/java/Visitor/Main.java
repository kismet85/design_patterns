package Visitor;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("document.txt", 2);
        File file2 = new File("photo.jpg", 2);
        File file3 = new File("notes.doc", 2);

        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory images = new Directory("images");

        docs.addElement(file1);
        docs.addElement(file3);
        images.addElement(file2);

        root.addElement(docs);
        root.addElement(images);

        SizeCalculatorVisitor rootSizeCalculator = new SizeCalculatorVisitor();
        root.accept(rootSizeCalculator);
        System.out.println("Total size of all files in root: " + rootSizeCalculator.getTotalSize() + " MB");

        SizeCalculatorVisitor docsSizeCalculator = new SizeCalculatorVisitor();
        docs.accept(docsSizeCalculator);
        System.out.println("Total size of all files in docs: " + docsSizeCalculator.getTotalSize() + " MB");

        SizeCalculatorVisitor imagesSizeCalculator = new SizeCalculatorVisitor();
        images.accept(imagesSizeCalculator);
        System.out.println("Total size of all files in images: " + imagesSizeCalculator.getTotalSize() + " MB");

        SearchVisitor searchVisitor = new SearchVisitor("doc");
        root.accept(searchVisitor);
        System.out.println("Files found with 'doc' in name:");
        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(" - " + file.getName());
        }

        SearchVisitor imageVisitor = new SearchVisitor("jpg");
        images.accept(imageVisitor);
        System.out.println("Files found with 'jpg' in name:");
        for (File file : imageVisitor.getFoundFiles()) {
            System.out.println(" - " + file.getName());
        }
    }
}
