package coms572.minesweeper.bean;

public class Square {

	//private boolean containsMine;
	private int noOfMinesAround;
	private boolean enabled;
	private boolean flagged;
	private int locX, locY;
	private boolean marked;

	public boolean isMarked() {
		return marked;
	}

	public void setMarked(boolean marked) {
		this.marked = marked;
	}

	/*public Square(boolean containsMine, int x, int y){
     this.containsMine = containsMine;
     noOfMinesAround = -1;
     enabled = true;
     flagged = false;
     locX = x;
     locY = y;
     }
	 */
	public Square(int x, int y) {
		//this.containsMine = containsMine;
		noOfMinesAround = -1;
		enabled = true;
		flagged = false;
		locX = x;
		locY = y;
	}
	/*public void setContainsMine(boolean containsMine) {
     this.containsMine = containsMine;
     }*/

	public int getNoOfMinesAround() {
		return noOfMinesAround;
	}

	public void setNoOfMinesAround(int noOfMinesAround) {
		this.noOfMinesAround = noOfMinesAround;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isFlagged() {
		return flagged;
	}

	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	/*public boolean isContainsMine() {
     return containsMine;
     }
	 */
	@Override
	public String toString() {
		return "<" + locX + " , " + locY + "> No Of Mines Around : " + noOfMinesAround;
	}

	@Override
	public int hashCode() {
		return noOfMinesAround;
	}

	public int getLocX() {
		return locX;
	}

	public int getLocY() {
		return locY;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Square) {
			Square otherSquare = (Square) obj;
			return otherSquare.getLocX() == locX && otherSquare.getLocY() == locY;
		}
		return false;
	}

}
