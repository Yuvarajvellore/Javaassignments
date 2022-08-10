import java.util.Scanner;
public class gusser {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int b;
		int []a=new int[50];
		Umpire u= new Umpire();
		System.out.println("General Instruction of the game");
		System.out.println("There will be 3 Level to play");
		System.out.println("Gusser will guess then  player has to predict the guesser's no ");
		System.out.println("In level one guesser will guess number between 1-10 ");
		System.out.println("In level two guesser will guess number between 10-100");
		System.out.println("In Finals guesser will guess number between 100-1000");
		System.out.println("\n Team any number key to start the game");
		s.nextInt();
		u.players();
	/*	a=u.selection();
		b=u.selectionno();
		for(int i=0;i<b;i++)
		{System.out.println("main");
			System.out.println(a[i]);
		}
		*/
	
	}

}

class Gus
{
	int gno;
	 
	public int gno()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\n Guesser :Type the secreat code");
		gno=s.nextInt();
		return gno;
	}
	void star()
	{
		System.out.println("##### i  ###########   level  1   ############nueron#############");
	}
	void star1()
	{
		System.out.println("####### i #########   level  2   ##############nueron############");
	}
	void star2()
	{
		System.out.println("########i ########   FINALS   #############nueron#############");
	}
}

class Player
{
	int plgsno;
	char r;
	String name;
	public int plgsno()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter  the guesed number");
		plgsno=s.nextInt();
		return plgsno;
	}
	void name()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter your name");
		name=s.nextLine();
	}
	void result (char a)
	{
	r=a;
	}
	char returnresult ()
	{
		if (r=='p')
		{
	return ('y');
		}
		if (r=='f'||r=='d')
		{
			return('f');
		}
		if (r=='w')
		{
			return('w');
		}
		return 'n';
	}
	void nameout()
	{
		System.out.println(name);
	}
}

class Umpire 
{
	int ugno,fin=0;
	int first[]=new int[50];
	int finals[]=new int[50];
	int no;
	int s=0;
	int semi=0;
	int fina=0;
	
	public 
         int[]  selection()
		{
		return first;
		}
	 int  selectionno()
		{
		return semi;
		}
	void guess()
	{
		Gus g=new Gus();
		System.out.println("\n Gusser Enter the no between 0 - 10");
		ugno=g.gno();
		while(!(ugno>0&&ugno<10))
		{
			System.out.println("Gusser your no should with in 10");
			ugno=g.gno();
		}	
			
	}
	public void players()
	{
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of  players");
		no=sc.nextInt();
		int []up= new int[no];
		Player P[]=new Player[no];
		for (int i=0;i<no;i++)
		{
			P[i]=new Player();
			System.out.println("player"+i);
			P[i].name();
		}
		System.out.println("Team enter any number key to commence the level one game");
		sc.nextInt();
		Gus gi=new Gus();
		for(int k=0;k<1000;k++)
			gi.star();
		System.out.println("Gusser remember that your no should be with 0- 10");
		ugno=gi.gno();
		while(!(ugno>0&&ugno<10))
		{
			System.out.println("Gusser no should with in 10");
			ugno=gi.gno();
		}
		System.out.println("---------------------------------------------------------------------------------------");
		//player guessing the no and also simult. umpire check and result
		for(int i=0;i<no;i++)
		{
			int l=-1;
			P[i].nameout();
			System.out.println("players no should be with in 0-10");
while(!(l>0&&l<10))
{
			l=P[i].plgsno();
			
}
			if(l==ugno)
			{
				P[i].result('p');
			}
		}
		char o;
		for(int k=0,i=0;k<no;k++)
		{
		o=P[k].returnresult();
		if(o=='y')
		{
		first[i]=k;
		i++;
		s++;
		semi=k;
		fin++;
		}
		}
		if (fin==1)
		{
			P[semi].result('d');
			System.out.println("Your are selected for the direct finals");
		}
		else if (fin==0)
		{
			System.out.println("Team you lost the game better luck next time");
			System.exit(0);
		}
		//selected to next level candiates name
		System.out.println("---------------------------------------------------------------------------------------");

		int li=0;
		while(li<s)
		{  
			int k;
			k=first[li];
		
			P[k].nameout();
			 
		
			li++;
		}
		if(fin>1)
		{
		//level 2
			System.out.println(" are selected for the next level two ");
		System.out.println("Team enter any number key to commence the level two game");
        sc.next();
        for(int k=0;k<1000;k++)
        gi.star1();
		char k;
		Gus g=new Gus();
		
		System.out.println("Gusser remember that your no should be with 10 - 100");
		ugno=g.gno();
		while(!(ugno>10&&ugno<100))
		{
			System.out.println("Gusser no should be with in 10 to 100");
			ugno=g.gno();
		}
		
		for(int i=0;i<no;i++)
		{
			int a=-1;
			k=P[i].returnresult();
			if(k=='y')
			{
			P[i].nameout();
			System.out.println("Players no should be with in 10 to 100");
			        while(!(a>10&&a<100))
			        {
					a=P[i].plgsno();
			        }
					
					
					if (ugno==a)
					{
			
						P[i].result('f');
					}
				
				
			}
		}
		System.out.println("candidate selected for the finals are");
		for(int i=0,ku=0;i<no;i++)
		{
			char ko;
			ko=P[i].returnresult();
			if(ko=='f')
			{
				P[i].nameout();
				finals[ku]=i;
				ku++;
				fina++;
				
				
			}
		}
		if(fina==0)
		{System.out.println("    None     ");
			System.out.println("Team you lost the game better luck next time");
			System.exit(0);
		}
		}
		System.out.println("Team enter any number key to commence the ###  FINALS ###");
        sc.next();
		for(int k=0;k<1000;k++)
		gi.star2();
		System.out.println("\t Finals");
		System.out.println("Team ,Rules for the final game Guesser will guess the no between 100 to 1000 @choose accordingly");
		System.out.println("Gusser :Your no should be between 100 and 1000");
		Gus g=new Gus();
		ugno=g.gno();
		while(!(ugno>100&&ugno<1000))
		{
			System.out.println("Gusser --range should be with in 100 to 1000");
			ugno=g.gno();
		}
		System.out.println("Player --range should be with in 100 to 1000");
		for(int i=0,ko;i<no;i++)
		{
			ko=-1;
			if(P[i].returnresult()=='f')
			{
				P[i].nameout();
				while(!(ko>100&&ko<1000))
				{
				ko=P[i].plgsno();
				}
				if(ko==ugno)
				{
					P[i].result('w');
				}
			}
		}
	System.out.println("---------------------------------------------------------------------------------------");
		int ku=0;
		for(int i=0;i<no;i++)
		{
			char ko;
			ko=P[i].returnresult();
			if(ko=='w')
			{
				P[i].nameout();
				
				
				ku++;
			}
	
		}
		
		if(ku==0)
		{
			System.out.println("Team you lost the game better luck next time");
		}
		else
			System.out.println("**************You won the Game !!!!! @@@@@@@@@@");
		System.out.println(" Enter the  number key to view the match point ");
		sc.nextInt();
		System.out.println("         Match         Point     ");
		System.out.println(" The candidates selected for the level 1 are ");
		for (int i=0;i<no;i++)
		{
			if(P[i].returnresult()=='y'||P[i].returnresult()=='f'||P[i].returnresult()=='w')
			{
				P[i].nameout();
			}
		
		}
		System.out.println(" The candidates selected for the level 2 are ");
		for (int i=0;i<no;i++)
		{
			if(P[i].returnresult()=='f'||P[i].returnresult()=='w')
			{
				P[i].nameout();
			}
		}
		System.out.println(" The Final winner is/are ");
		for (int i=0;i<no;i++)
		{
			if(P[i].returnresult()=='w')
			{
				P[i].nameout();
			}
		}
		
	}
	
	
}






















