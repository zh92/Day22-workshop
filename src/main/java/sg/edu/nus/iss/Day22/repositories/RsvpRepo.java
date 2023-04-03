package sg.edu.nus.iss.Day22.repositories;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.Day22.models.Rsvp;

@Repository
public class RsvpRepo {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_ALLRSVP_SQL = "select * from rsvp";

    public List<Rsvp> getAllRsvp() {

        // final List<Rsvp> rsvpList = new LinkedList<Rsvp>();
        // final SqlRowSet rs = jdbcTemplate.queryForRowSet(GET_ALLRSVP_SQL);

        return jdbcTemplate.query(GET_ALLRSVP_SQL, BeanPropertyRowMapper.newInstance(Rsvp.class));
        // while (rs.next()) {

        //     Rsvp rsvp = new Rsvp();
        //     rsvp.setId(rs.getInt("id"));
        //     rsvp.setFullName(rs.getString("full_name"));
        //     rsvp.setEmail(rs.getString("email"));
        //     rsvp.setPhone(rs.getString("phone"));
        //     rsvp.setConfirmationDate(rs.getDate("confirmation_date"));
        //     rsvp.setComments(rs.getString("comments"));
        //     rsvpList.add(rsvp);
        // }
        // return Collections.unmodifiableList(rsvpList);
    }
}
