package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInIt member1 = new MemberInIt();
        initMember(member1, "user1", 15, 90);
        MemberInIt member2 = new MemberInIt();
        initMember(member2, "user1", 15, 90);

        MemberInIt[] members = {member1, member2};

        for (MemberInIt member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);

        }
    }

        static void initMember(MemberInIt member, String name,  int age, int grade) {
            member.name = name;
            member.age = age;
            member.grade = grade;
        }
}
