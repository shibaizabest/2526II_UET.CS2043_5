public class FileItem extends FileSystemItem{
    private int size; //KB

    public FileItem(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "File: " + this.name + " (" + size + "KB)");
    }
}
