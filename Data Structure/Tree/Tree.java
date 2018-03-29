import java.io.BufferedReader;
import java.io.InputStreamReader;
class Node
{
    int data;
    Node left , right ; 
    Node( int data ) 
    {
      this.data = data ;
    }
}
class Tree
{
    public static void main(String ... a)
    {
        Tree t = new Tree() ; 
        t.logic() ;
    }
}
