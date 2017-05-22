import java.io.IOException;
import java.util.regex.Pattern;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class MapperClass extends Mapper<LongWritable, Text, Text, IntWritable> {
	public void map(LongWritable Key, Text Value, Context context) throws IOException, InterruptedException {
		String[] data = Value.toString().split(",");
		IntWritable one=new IntWritable(1);
		Text t=new Text(data[0]);
			context.write(t, one);
		}
	}
