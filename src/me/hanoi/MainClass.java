package me.hanoi;

public class MainClass {
	public static int sayac=0;
	
	public static void main(String[] args) {
        int diskSayisi=3;
        char kaynakCubugu='A',yardımcıCubugu='B',hedefCubugu='C';
        hanoiCoz(diskSayisi,kaynakCubugu,yardımcıCubugu,hedefCubugu);
	}
	public static void hanoiCoz(int diskSayisi, char kaynak, char yardımcı, char hedef) {
		if (diskSayisi>0) {
		    hanoiCoz(diskSayisi-1,kaynak,hedef,yardımcı);
		    sayac++;
			System.out.println(sayac+": Disk "+diskSayisi+" "+kaynak+" cubugundan "+hedef+" cubuguna tasindi");
			
			
			hanoiCoz(diskSayisi-1,yardımcı,kaynak,hedef);
		}
	}

}
