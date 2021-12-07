/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains two methods: addMembers and removeMembers
 **/

public class 2021FRQ3

{

    public static void main(String[] args) {

    }

    public void addMembers(String[] names, int gradYear) {

        for (int i = 0; i < names.length; i++) {

            memberList.add(new MemberInfo(names[i], gradYear, true));

        }

    } 

    public ArrayList<MemberInfo> removeMembers(int year) {

        ArrayList<MemberInfo> goodNotGrad = new ArrayList<MemberInfo>();

        for (int i = 0; i < memberList.size(); i++) {

            if (memberList.get(i).getGradYear <= year) {

                if (memberList.get(i).inGoodStanding()) goodNotGrad.add(memberList.get(i));
                memberList.remove(i);
                i--;

            }

        }

        return goodNotGrad;

    }

}
