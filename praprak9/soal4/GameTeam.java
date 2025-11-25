import java.util.*;

public class GameTeam implements Team {
    private String teamName;
    // TODO: Gunakan List untuk menyimpan urutan anggota team
    
    // TODO: Gunakan Map untuk quick lookup member berdasarkan nama
    private List<TeamMember> members;
    private Map<String, TeamMember> memberMap;
    
    public GameTeam(String teamName) {
        this.teamName = teamName;
        this.members = new ArrayList<>();
        this.memberMap = new HashMap<>();
    }
    
    // TODO: Implement addMember
    // Tambahkan member ke List dan Map
    // Tambahkan role "Player" ke Set
    public void addMember(TeamMember member){
        if (member == null) return;

        members.add(member);
        memberMap.put(member.getName(),member);
    }
    
    // TODO: Implement removeMember
    // Cari dan hapus member dari List menggunakan iterator
    // Hapus dari Map juga
    public void removeMember(String name) {
        if (name == null) return;

        Iterator<TeamMember> it = members.iterator();
        while (it.hasNext()) {
            TeamMember m = it.next();
            if (m.getName().equalsIgnoreCase(name)) {
                it.remove();
                memberMap.remove(name);
            }
        }
    }

    // TODO: Implement findMember
    // Gunakan Map untuk quick lookup
    public TeamMember findMember(String name) {
        if (name == null) return null;
        return memberMap.get(name);
    }

    // TODO: Buat method getAllMembers() return List<TeamMember>
    public List<TeamMember> getAllMembers() {
        return new ArrayList<>(members);
    }

    // TODO: Buat method getTeamSize() return int
    public int getTeamSize() {
        return members.size();
    }
    
    // TODO: Buat method getTopSkillPlayer() return TeamMember
    // Loop melalui List dan cari player dengan skill tertinggi
    public TeamMember getTopSkillPlayer() {
        if (members.isEmpty()) return null;
        
        TeamMember best = members.get(0);
        for (TeamMember m : members) {
            if (m.getSkillLevel() > best.getSkillLevel()) {
                best = m;
            }
        }
        return best;
    }
    
    // TODO: Buat method getPlayersBySkillLevel(int minSkill) return List<TeamMember>
    // Filter players yang skill-nya >= minSkill
    public List<TeamMember> getPlayersBySkillLevel(int minSkill) {
        List<TeamMember> result = new ArrayList<>();
        for (TeamMember m : members) {
            if (m.getSkillLevel() >= minSkill) {
                result.add(m);
            }
        }
        return result;
    }
    
    // TODO: Buat method getTeamName() return String
    public String getTeamName() {
        return teamName;
    }
}