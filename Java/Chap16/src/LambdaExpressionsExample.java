import java.util.*;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("��浿", 90), new Student("�ϵ���", 91));

		Stream<Student> stream = list.stream();

		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});

	}

}
