

class Main{

	public static void main(String[] args) {


		Level lvl = Level.LOW;

		Level[] arr = Level.values();

		for (Level e : arr) {

		System.out.println(e);
	

		}
		

		if(lvl == Level.LOW) {
			
			System.out.println(lvl);


			} else if (lvl == Level.MEDIUM) {

			System.out.println(lvl);

		} else {


			System.out.println(lvl);

		}
	

		
		System.out.println(lvl.getLvl());

		System.out.println(Level.valueOf("LOW"));


		lvl.setLvl(5);

		System.out.println(lvl.getLvl());



	}

}



// enum 



enum Level {


	HIGH(3),

	MEDIUM(2),

	LOW(1);

	
	private int lvlNum;

	private Level(int num){

		this.lvlNum = num;
		
	}



	public int getLvl() {


		return this.lvlNum;

	}



	public void setLvl(int num){

		this.lvlNum = num;


	}


}
