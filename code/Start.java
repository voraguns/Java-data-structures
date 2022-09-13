class Start {
    public static void main(String[] data) {
       int[] a = { 8, 7, 5, 4, 6, 7, 3 };
       Engine.show(); // Welcome to Engine
       Block last = Engine.create(a);
       for (Block current = last; current != null; current = current.back) {
           System.out.print(current.number + " "); // 3 7 6 4 5 7 8 
       }
        System.out.println("-------------");
        System.out.println("Maximum number is " + Engine.findMax(last).number);
        System.out.println("Minimum number is " + Engine.findMin(last).number);
        System.out.println("All block has " + Engine.count(last) + " block");
        
        // New style
        System.out.println("-------------");
        if(last == null) {
            System.out.println("There is no data");
        } else {
            int best = last.number;
            for (Block current = last; current != null; current = current.back) {
                if(current.number > best) {
                    best = current.number;
                }
            }
            System.out.println("The maximum value is " + best);
        }
    } 
}

class Engine {
    static void show() {
        System.out.println("Welcome to Engine");
    }
    
    static Block create(int[] data) {
        Block tail = null; // Local variable is the only one type that has no default value
        for (int i = 0; i < data.length; i++) {
            Block current = new Block();
            current.number = data[i];
            current.back = tail;  // keep the latest element
            tail = current; // change the latest to tail
        }
        return tail;
    }
    
    static Block findMax(Block b) {
        Block result = b;
        for (Block c = b; c != null; c = c.back) {
            if (result.number < c.number) {
                result = c;
            }
        }
        return result;
    }
    
    static Block findMin(Block b) {
        Block result = b;
        for (Block c = b; c != null; c = c.back) {
            if (result.number > c.number) {
                result = c;
            }
        }
        return result;
    }
    
    static int count(Block b) {
        if(b == null) return 0;
        return 1 + count(b.back);
    }
}

class Block {
    Block back;    // address of the previous block (element)
    String name;
    int number;
}