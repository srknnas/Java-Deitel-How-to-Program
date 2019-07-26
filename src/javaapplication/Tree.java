// Fig. 22.17: Tree.java
// TreeNode and Tree class declarations for a binary search tree.
package javaapplication;

// class TreeNode definition
class TreeNode< T extends Comparable< T > > 
{
   // package access members
   TreeNode< T > leftNode; // left node  
   T data; // node value
   TreeNode< T > rightNode; // right node

   // constructor initializes data and makes this a leaf node
   public TreeNode( T nodeData )
   { 
      data = nodeData;              
      leftNode = rightNode = null; // node has no children
   } // end TreeNode constructor

   // locate insertion point and insert new node; ignore duplicate values
   public void insert( T insertValue )
   {
      // insert in left subtree
      if ( insertValue.compareTo( data ) < 0 ) 
      {
         // insert new TreeNode
         if ( leftNode == null )
            leftNode = new TreeNode< T >( insertValue );
         else // continue traversing left subtree recursively
            leftNode.insert( insertValue ); 
      } // end if
      // insert in right subtree
      else if ( insertValue.compareTo( data ) > 0 ) 
      {
         // insert new TreeNode
         if ( rightNode == null )
            rightNode = new TreeNode< T >( insertValue );
         else // continue traversing right subtree recursively
            rightNode.insert( insertValue ); 
      } // end else if
   } // end method insert
} // end class TreeNode

// class Tree definition
public class Tree< T extends Comparable< T > >
{
   private TreeNode< T > root;

   // constructor initializes an empty Tree of integers
   public Tree() 
   { 
      root = null; 
   } // end Tree no-argument constructor

   // insert a new node in the binary search tree
   public void insertNode( T insertValue )
   {
      if ( root == null )
         root = new TreeNode< T >( insertValue ); // create root node
      else
         root.insert( insertValue ); // call the insert method
   } // end method insertNode

   // begin preorder traversal
   public void preorderTraversal()
   { 
      preorderHelper( root ); 
   } // end method preorderTraversal

   // recursive method to perform preorder traversal
   private void preorderHelper( TreeNode< T > node )
   {
      if ( node == null )
         return;

      System.out.printf( "%s ", node.data ); // output node data
      preorderHelper( node.leftNode ); // traverse left subtree
      preorderHelper( node.rightNode ); // traverse right subtree
   } // end method preorderHelper

   // begin inorder traversal
   public void inorderTraversal()
   { 
      inorderHelper( root ); 
   } // end method inorderTraversal

   // recursive method to perform inorder traversal
   private void inorderHelper( TreeNode< T > node )
   {
      if ( node == null )
         return;

      inorderHelper( node.leftNode ); // traverse left subtree
      System.out.printf( "%s ", node.data ); // output node data
      inorderHelper( node.rightNode ); // traverse right subtree
   } // end method inorderHelper

   // begin postorder traversal
   public void postorderTraversal()
   { 
      postorderHelper( root ); 
   } // end method postorderTraversal

   // recursive method to perform postorder traversal
   private void postorderHelper( TreeNode< T > node )
   {
      if ( node == null )
         return;
  
      postorderHelper( node.leftNode ); // traverse left subtree
      postorderHelper( node.rightNode ); // traverse right subtree
      System.out.printf( "%s ", node.data ); // output node data
   } // end method postorderHelper
} // end class Tree

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
