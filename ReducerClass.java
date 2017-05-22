import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
public class ReducerClass extends Reducer<Text, IntWritable, Text, IntWritable>
{	
	private IntWritable tot = new IntWritable();
	private int minValue = Integer.MIN_VALUE;
	@Override
	public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException
	{	
		int count = 0;
		for ( IntWritable value : values ) 
		{	if(value.get()>minValue){
			count+=value.get();
		}
		}
		tot.set(count);
		context.write(key, tot);
	}
}