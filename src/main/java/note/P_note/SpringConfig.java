package note.P_note;

import note.P_note.aop.TimeTraceAop;
import note.P_note.repository.MemberRepository;
import note.P_note.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }

//    @Bean
//    public MemberRepository memberRepository() {
//        // return new MemoryMemberRepository(); // 로컬 메모리
//        // return new JdbcMemberRepository(dataSource); // jdbc
//        // return new JdbcTemplateMemberRepository(dataSource); // jdbc Template
//        // return new JpaMemberRepository(em); // jpa
//    }
}