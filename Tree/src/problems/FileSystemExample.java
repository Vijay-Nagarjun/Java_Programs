package problems;
class FileNode {
    String name;
    FileNode left, right;

    FileNode(String name) {
        this.name = name;
    }
}
public class FileSystemExample {
	  public static void preorder(FileNode node) {
	        if (node == null) return;
	        System.out.println(node.name); 
	        preorder(node.left);          
	        preorder(node.right);          
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileNode root = new FileNode("Root");
	        root.left = new FileNode("Photos");
	        root.right = new FileNode("Documents");
	        root.left.left = new FileNode("Vacation.jpg");
	        root.right.left = new FileNode("Resume.docx");
	        root.right.right = new FileNode("Project.pdf");

	        System.out.println("File Structure (Preorder Traversal):");
	        preorder(root);
		
    }

	

}
