
public class PersonInfo {

	public static void showPersonInfo() {
		/*
	    개인정보 출력 예제.
	    
	    이름(문자)  String"조현"
	    나이(정수)  int 25
	    성별(문자)  char"남"
	    신장(실수)  double"183.2"
	    몸무게(실수) double"80.56"
	    결혼여부(판별) boolean"false"
	    전화번호(문자) String"010-5099-2133"
	    주소(문자) String"대전광역시 중구 용두동 희영빌딩"

	    */
	    String name = "조현";
	    int age = 25;
	    char gender = '남';
	    double higher = 183.2;
	    float weight = 80.56F;
	    boolean married = false;
	    String phone = "010-5099-2133";
	    String address = "대전광역시 중구 용두동 희영빌딩";

	    System.out.println("이름: " + name + "\n나이: " + age + "\n성별: " + gender+"\n키: " + higher +"\n몸무게: " + weight + "\n결혼여부: "+ married + "\n전화번호: " +phone+"\n주소: " + address);
	    /*System.out.println("나이: " + age);
	    System.out.println("성별: " + gender);
	    System.out.println("키: " + higher);
	    System.out.println("무게: " + weight);
	    System.out.println("결혼여부: " + married);
	    System.out.println("전화번호: " + phone);
	    System.out.println("주소: " + address);
	*/
	}

}
