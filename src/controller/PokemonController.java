package controller;
import model.*;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values
			//pokemonNumber = 001
			//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
			//type = "POISON"
			//evolution = "IVYSAUR"
			//baseExp = "64" 
			Bulbasaur b=new Bulbasaur("Bulbasaur", 001, "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.", "POISON", "IVYSAUR", "64");
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1", b.getEvolution());
			request.setAttribute("baseExp1",b.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values
			//pokemonName = Charizard
			//pokemonNumber = 006
			//characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers."
			//type = "FIRE"
			//evolution = "CHARMELEON"
			//baseExp = "240"
			
			Charizard b=new Charizard("Charizard", 006, "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.", "FIRE", "CHARMELEON", "240");
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1", b.getEvolution());
			request.setAttribute("baseExp1",b.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values
			//pokemonName = Dragonite
			//pokemonNumber = 149
			//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism."
			//type = "DRAGON"
			//evolution = "DRATINI"
			//baseExp = "270" 

			Dragonite b=new Dragonite("Dragonite", 149, "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.", "DRAGON", "DRATINI", "270");
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1", b.getEvolution());
			request.setAttribute("baseExp1",b.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			//pokemonName = Mew
			//pokemonNumber = 151
			//characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
			//type = "PSYCHIC"
			//evolution = "NONE"
			//baseExp = "64" 
			Mew b=new Mew("Mew", 151, "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.", "PSYCHIC", "NONE", "64");
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1", b.getEvolution());
			request.setAttribute("baseExp1",b.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values
			/*pokemonName = Pikachu 
			 * pokemonNumber = 25 
			 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot." 
			 * type = "ELECTRIC" 
			 * evolution = "RAICHU" 
			 * baseExp = "112"
			 */

			Pikachu b = new Pikachu("Pikachu", 25, "Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.","ELECTRIC","RAICHU","112");
			msg = "<center>" + b.getPokemonName() + "  #" + b.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", b.getCharacteristics());
			request.setAttribute("type1",b.getType());
			request.setAttribute("evolution1", b.getEvolution());
			request.setAttribute("baseExp1",b.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
