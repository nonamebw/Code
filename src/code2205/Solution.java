//package code2205;
//import java.lang.reflect.Array;
//import java.util.*;
//class Solution {
//    List<List<Character>> collector = new ArrayList<>();
//
//    public String[] permutation(String s) {
//        char[] chars = s.toCharArray();
//        int[] visited = new int[chars.length];
//        List<List<Character>> list = new ArrayList<>();
//        for(int i=0; i<chars.length; i++){
//            dftHelper(chars,visited,new ArrayList<>(),i);
//        }
//        String[] res = new String[collector.size()];
//        for(int i=0; i<collector.size(); i++) {
//            res[i] = String.join((CharSequence) collector.get(i),"");
//        }
//        return res;
//    }
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder.length == 0 || inorder.length == 0) return null;
//        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
//    }
//
//    public TreeNode helper(int[] preorder,int ps,int pe,int[] inorder,int is,int ie){
//        if(pe > ps || ie > is) return null;
//        TreeNode root = new TreeNode(preorder[ps]);
//        for(int i=is; i<=ie; i++) {
//            if(inorder[i]==preorder[ps]){
//                root.left = helper(preorder,ps+1,ps + (i - is),inorder,is,i-1);
//                root.right = helper(preorder,ps+(i-is)+1,pe,inorder,i+1,ie);
//            }
//        }
//        return root;
//    }
//}