 
public class Test3 {


    public static void main(String[] args) {


    final String [] b = new String [] { "{uuid: 2, name: 'Darling'}", "{uuid: 3, name: 'Cry-Baby'}", "{uuid: 4, name: 'Snitch'}", "{uuid: 5, name: 'Pawn'}" };
    final String [] a = new String[] { "{uuid: 1, role: 'admin'}", "{uuid: 2, role: 'contributor'}", "{uuid: 3, role: 'owner'}", "{uuid: 4, role: 'contributor'}" } ;
  
    
  

    }



}

//OUTPUT //[ // {uuid:1, name: null, role: 'admin'},
  // {uuid:2, name: 'Darling', role: 'contributor'},
   // {uuid:3, name: 'Cry-Baby', role: 'owner'},
    // {uuid:4, name: 'Snitch', role: 'contributor'}, 
    // {uuid:5, name: 'Pawn', role: null} //] 

