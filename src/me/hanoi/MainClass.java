package me.hanoi;

public class MainClass {
	public static int sayac=0;
	
	public static void main(String[] args) {
        int diskSayisi=3;
        char kaynakCubugu='A',yard�mc�Cubugu='B',hedefCubugu='C';
        hanoiCoz(diskSayisi,kaynakCubugu,yard�mc�Cubugu,hedefCubugu);
	}
	public static void hanoiCoz(int diskSayisi, char kaynak, char yard�mc�, char hedef) {
		if (diskSayisi>0) {
		    hanoiCoz(diskSayisi-1,kaynak,hedef,yard�mc�);
		    sayac++;
			System.out.println(sayac+": Disk "+diskSayisi+" "+kaynak+" cubugundan "+hedef+" cubuguna tasindi");
			
			
			hanoiCoz(diskSayisi-1,yard�mc�,kaynak,hedef);
		}
	}

}
