public class main {
    public static void main(String[] args) {
        list l1=new list();
        playgroundOwner po2=new playgroundOwner("youssef","fisa");
        playground pg1=new playground("ground1",123,"sdfa","hh",54);
        playground pg2=new playground("ground2",456,"helwan","tt",54);

        po2.addGround(pg1,l1);
        po2.addGround(pg2,l1);
        po2.display();

        Player p1=new Player("youssef","sdfa",1,"23451","fsda");
        Player p2=new Player("omar","sdfa",2,"5344451","fasfdsdfaa");
        p1.book(l1);
        p2.book(l1);
    }
}
