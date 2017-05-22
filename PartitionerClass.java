import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;
public class PartitionerClass extends Partitioner<Text, IntWritable> {
        @Override
	public int getPartition(Text key, IntWritable value, int arg2) {
	
		int k = key.toString().length();
		if (k==5) 
		{		
				return 0;
		}
		else if (k==6)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	
	}