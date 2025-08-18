package lgcns.inspire.post.ctrl;

public class PostUpdateCtrl {

    public int update( String title, String content, int id){
        System.out.println(">>> post insert crtl insert patams title : " +title);
        System.out.println(">>> post insert crtl insert patams content : " +content);
        System.out.println(">>> post insert crtl insert patams writer : " +id);
        return 1;
}
}
