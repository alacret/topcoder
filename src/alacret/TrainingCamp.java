package alacret;

public class TrainingCamp {
	public String[] determineSolvers(String[] attendance, String[] problemTopics){
		int numeroEstudiantes = attendance.length;
		int numeroProblemas = problemTopics.length;
		String[] result = new String[numeroEstudiantes];
		
		for(int i = 0; i < numeroEstudiantes ; i++){//Cada estudiante
			char[] asistencia = attendance[i].toCharArray();
			StringBuilder tempResult = new StringBuilder();
			for(int j = 0; j < numeroProblemas; j++){//Cada problema
				char[] problema = problemTopics[j].toCharArray();
				boolean flag = true;
				for (int k = 0; k < problema.length; k++) {
					if(problema[k] == 'X')
						if(asistencia[k] == 'X')
							continue;
						else{
							flag = false;
							break;
						}
				}
				if(flag)
					tempResult.append("X");
				else
					tempResult.append("-");
				
			}
			result[i] = tempResult.toString();
			
			
			
		}
		
		return result;
	}
	
//	public static void main(String[] args){
//		TrainingCamp t = new TrainingCamp();
//		String[] a = {"-XXXX",
//				"----X",
//				"XXX--",
//				"X-X-X"};
//		String[] p = {"X---X",
//				"-X---",
//				"XXX--",
//				"--X--"};
//		
//		String[] d = t.determineSolvers(a, p);
//		
//		for (int i = 0; i < d.length; i++) {
//			System.out.println(d[i]);
//		}
//		
//	}
}
