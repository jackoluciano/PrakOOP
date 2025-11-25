import java.util.*;

public class Tournament {
    private String tournamentName;
    private List<Team> teams;
    private Map<String, Team> teamMap;
    private Set<String> playedTeams; 
    
    // TODO: Gunakan List untuk urutan tim
    
    // TODO: Gunakan Map untuk quick lookup tim berdasarkan nama
    
    // TODO: Gunakan Set untuk track nama-nama tim yang sudah bertanding
    
    public Tournament(String tournamentName) {
        this.tournamentName = tournamentName;
        this.teams = new ArrayList<>();
        this.teamMap = new HashMap<>();
        this.playedTeams = new HashSet<>();
    }
    
    // TODO: Buat method registerTeam(GameTeam team)
    // Tambahkan team ke List dan Map

    public void registerTeam(GameTeam team){
        teams.add(team);
        teamMap.put(team.getTeamName(),team);
    }
    
    // TODO: Buat method getTeam(String teamName) return GameTeam
    // Gunakan Map untuk lookup
    public GameTeam getTeam(String teamName) {
        return (GameTeam) teamMap.get(teamName);
    }
    
    // TODO: Buat method recordMatch(String team1Name, String team2Name)
    // Tambahkan kedua tim ke playedTeams Set
    public void recordMatch(String team1Name, String team2Name) {
        if (team1Name != null) playedTeams.add(team1Name);
        if (team2Name != null) playedTeams.add(team2Name);
    }
    
    // TODO: Buat method getTotalTeams() return int
    public int getTotalTeams() {
        return teams.size();
    }
    
    // TODO: Buat method getTeamsNotPlayed() return List<String>
    // Return team yang belum bertanding (tidak ada di Set playedTeams)
    public List<String> getTeamsNotPlayed() {
        List<String> result = new ArrayList<>();

        for (Team t : teams) {
            // karena kita register GameTeam, safe untuk cast
            GameTeam gt = (GameTeam) t;
            String name = gt.getTeamName();

            if (!playedTeams.contains(name)) {
                result.add(name);
            }
        }

        return result;
    }

    
    // TODO: Buat method getAllTeams() return List<GameTeam>
    public List<GameTeam> getAllTeams() {
        List<GameTeam> result = new ArrayList<>();
        for (Team t : teams) {
            result.add((GameTeam) t);
        }
        return result;
    }
}