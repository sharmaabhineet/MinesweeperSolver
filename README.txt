==============================
MinesweeperSolver
==============================
					Contact abhineet@iastate.edu) for further information or any help.
Description
----------------
	An automated agent that attempts to solve Minesweeper problem by reducing it to a CSP. This project contains of three different components :
	
	Part I : Problem Generator. 
			Generates the minesweeper problem randomly.
	Part II : Problem Solver
			Attempts to solve the minesweeper problem generated
	Part III: Manager
			Acts as the interface between Solver and Generator. Solvers sends a query for a specific location via Manager to the Generator, which in turn responds according to the rules of the game.
			
Setting the Expectation
-----------------------------
	This is an experimental tool and there are known issues as a result of which, it is not 100% correct in solving the problem, which is 100% solvable mathematically. This is due to flaws in design or implementation. The entire run of the code is to try and solve the problem recording all the incorrect guesses that were made so as to analyze the performance of the tool. This performance analysis helped in removing some of the nasty bugs that were there in the implementation. This feature was so cool, that it was decided to carry it forward as a part of the project. The agent makes calculated guesses and the incorrect ones are recorded and an output displayed at the end of each iteration. See @section on deliverables on running it in different modes.

Deliverables
-----------------
	Minesweeper.jar : Standalone runnable jar file. The MinesweeperSolver.jar has two modes. 
		MODE I : Data generation mode for analysis. In this mode, minesweeper in run in some present configurations ( square matrix of size 5 x 5 ,  10 x 10 ) in all the three difficulty modes for performance analysis and improvement purposes.
		MODE II : To invoke it to solve a particular configuration of minesweeper problem ( mines are always placed randomly). Currently, does not support a way to input a specific minesweeper problem.
	
	Running the JAR
	----------------
	
		The MineweeperSolver is to be called in the following manner in command line interface (Unix/Windows):
		
		First of all, need to go to the directory containing the Minesweeper.jar file using the command : cd <path to the directory> ( on both unix and windows systems )
		
		Running in MODE I : Analysis Mode ( This is cool. Do give it a shot!!)
			java -jar MinesweeperSolver.jar 
				This form of calling the agent is used for generating data for analysis and will produce a result.csv file. 
				NOTE: This somtimes goes into an infinite loop, where you see 80% or 90% of the board turning green. No worries, you can try it again. If we are lucky, you would be able to see the beauty of the code without much  hassles. Please try it at least 3 times, if you keep on running into issues. Statistically, it seldom happens in the first go.
			
		Runnign in MODE II : Run Specific configuration ( n x m matrix, randomly generated) [ yeah, you can give it a shot too :)]
			java -jar MinesweeperSolver.jar <no of columns> <no of rows> <difficulty level>
				where 	<number of columns> : No of columns you want in the minesweeper problem
						<number of rows> : No of Rows you want in the minesweeper problem
						<difficulty level> : Set the difficulty level. Valid Values are : 0 -> Naiive, 1 --> Medium, 2 --> Expert 	
	
	
----------------------------------------------------

Effort 
-------------
24 person hours ( ~ 14 person hours for building and debugging)