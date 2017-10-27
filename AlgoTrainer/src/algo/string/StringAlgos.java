package algo.string;

  public  class StringAlgos {
	
	public static int findIndexOfPatern(String source, String pattern){
				
		int index=0;
		int sourceLen = source.length()-1;
		int patternLen = pattern.length()-1;
		
		for (int i=0;i <=sourceLen ;i++)
		{
			if (source.charAt(i) == pattern.charAt(0))
			{
				boolean matchFlag = false;
				
			for (int j=0; j<= patternLen ;j++)
			{
					if  (source.charAt(i+j) != pattern.charAt(j))
							{
						      break;
							}
					else 
					{
						if (j+1 == patternLen+1)
						{
							    index =i;
								matchFlag = true;
						}
					}
				
			}
			}
			
		}
			
		
		return index;
	}

}
