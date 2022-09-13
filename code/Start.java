class Start {
    public static void main(String[] data) {
        Element root;
        root = new Element();
        root.name = "iPhone";
        root.price = 30000.0;
        
        Element x;
        x = new Element();
        x.name = "iPad";
        x.price = 12000.0;
        
        root.left = x;
        
        root.right = new Element();
        root.right.name = "iPad";
        root.right.price = 6000.0;
        
        Element y;
        y = new Element();
        y.name = "Macbook";
        y.price = 45000.0;
        root.right.left = y;
        
        Element z;
        z = new Element();
        z.name = "AirPod";
        z.price = 7000.0;
        root.right.right = z;
        
        System.out.println(root.right.left.name); // Macbook
        System.out.println(Helper.count(root));
    }
}

class Helper {
    static int count(Element e) {
        if (e == null) return 0;
        return count(e.left) + count(e.right) + 1;
    }
}

 class Element {
     String name;  // null
     double price; // 0.0
     Element left; // null
     Element right; // null
 }