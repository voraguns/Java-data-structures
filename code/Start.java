class Start {
    public static void main(String[] data) {
       Block a = new Block();
       a.name = "Gun";
       a.number = 1;
       
       Block b = new Block();
       b.name = "Tom";
       b.number = 2;
       
       Block c = new Block();
       c.name = "Jerry";
       c.number = 3;
       
       // Write code fragment to print all element from the latest element
       c.back = b;
       b.back = a;
       
       for (Block current = c; current != null; current = current.back) {
           System.out.println(current.number + " " + current.name);
       }
       
    }
    
    
}

class Block {
    Block back;    // address of the previous block (element)
    String name;
    int number;
}