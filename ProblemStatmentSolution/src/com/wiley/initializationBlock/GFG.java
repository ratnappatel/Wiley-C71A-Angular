package com.wiley.initializationBlock;

class GFG {
    // Instance Initialization Block
    {
        System.out.println("IIB block");
    }
 
    // Constructor of GfG class
    GFG() { System.out.println("Constructor Called"); }
    public static void main(String[] args)
    {
        GFG a = new GFG();
    }
}
