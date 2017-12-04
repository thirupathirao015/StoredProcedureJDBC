
package umapath.net;
import java.sql.ResultSet;
import java.sql.SQLException; 
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
	static int count;
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException { 
			
			Student student = new Student(); 
		student.setId(rs.getInt("id")); 
		student.setName(rs.getString("name")); 
		student.setAge(rs.getInt("age"));
		count++;
		//System.out.println(count);
		return student;
		} 
}
