/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program contains the ClubMembers class from 2021 FRQ #3
 **/

public class ClubMembers

{

    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {

        memberList = new ArrayList<MemberInfo>();

    }

    public void addMembers(String[] names, int gradYear) {

        for (String name : names) {

            memberList.add(new MemberInfo(name, gradYear, true));

        }

    }

    public ArrayList<MemberInfo> removeMembers(int year) {

        ArrayList<MemberInfo> graduates = new ArrayList<MemberInfo>();

        for (int i = 0; i < memberList.size(); i++) {

            if (memberList.get(i).getGradYear() <= year) {

                if (memberList.get(i).inGoodStanding()) {

                    graduates.add(memberList.get(i));

                }

                memberList.remove(i);
                i--;

            }

        }

        return graduates;

    }

}
