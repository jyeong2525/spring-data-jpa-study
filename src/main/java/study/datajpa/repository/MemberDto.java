package study.datajpa.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import study.datajpa.entity.Member;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(Member m) {
        this.id = m.getId();
        this.username = m.getUsername();
        this.teamName = m.getTeam().getName();
    }
}
