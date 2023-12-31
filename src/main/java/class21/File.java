package class21;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open(), edit(), close()
and fields like name and size. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
 open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc.Create a tester
 class and call all of the methods from these classes.
     */
private String name;
private int size;

public File(String name, int size){
    this.name=name;
    this.size=size;
}

   abstract void open();

   public void edit(){
       System.out.println("Editing the file" + name);
   }


    public void close(){
        System.out.println("Closing the file" +name);
    }

}

class JavaFile extends File {

    public JavaFile(String name, int size) {
        super(name, size);
    }

    void open() {
        System.out.println("We need notepad++ or sublime text");
    }


    class PdfFile extends File {
        public PdfFile(String name, int size) {
            super(name, size);
        }

        void open() {
            System.out.println("We need PDF reader");
        }
    }

    class WordFile extends File {
        public WordFile(String name, int size) {
            super(name, size);
        }

        void open() {
            System.out.println("Using Microsoft word to open Word file");
        }
    }
}






