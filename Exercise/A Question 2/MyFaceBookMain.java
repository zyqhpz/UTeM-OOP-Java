import java.util.ArrayList;

public class MyFaceBookMain {
    public static void main(String[] args) {

        FaceBook fb = new FaceBook();
        fb.setUserID("sanusi123");

        Profile profile = new Profile();
        profile.setName("Sanusi Azmi");
        profile.setOccupation("Lecturer");
        profile.setEmail("sanusi@utem.edu.my");
        profile.setAlternativeEmailAddress("sanusiazmi@gmail.com");
        fb.setProfile(profile);

        ArrayList<Friend> friends = new ArrayList<Friend>();

        Friend ali = new Friend();
        ali.setFriendName("Ali bin Abu");
        ali.setFriendEmail("aliabu@gmail.com");
        ali.setFriendPhone("0123456789");

        Friend chang = new Friend();
        chang.setFriendName("Chang Gee Guan");
        chang.setFriendEmail("changgeeguan@gmail.com");
        chang.setFriendPhone("012987654321");
        friends.add(ali);
        friends.add(chang);
        fb.setFriends(friends);

        Profile sanusi_profile = fb.getProfile();
        System.out.println(sanusi_profile.getName() + "\t: " + sanusi_profile.getEmail());
        for (Friend f : fb.getFriends())
            System.out.println(f.getFriendName() + "\t: " + f.getFriendEmail() + " \t: " + f.getFriendPhone());
    }
}