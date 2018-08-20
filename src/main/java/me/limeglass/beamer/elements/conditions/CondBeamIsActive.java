package me.limeglass.beamer.elements.conditions;

import org.bukkit.event.Event;

import ch.njol.skript.doc.Description;
import ch.njol.skript.doc.Name;
import me.limeglass.beamer.lang.BeamerCondition;
import me.limeglass.beamer.utils.annotations.Patterns;
import net.jaxonbrown.guardianBeam.beam.ClientBeam;

@Name("Beam - is active")
@Description("Check if the beam is active.")
@Patterns("%beam% (1�is|2�is(n't|not)) active")
public class CondBeamIsActive extends BeamerCondition {

	public boolean check(Event event) {
		if (isNull(event, 0)) return !isNegated();
		return expressions.getSingle(event, ClientBeam.class).isActive() ? isNegated() : isNegated();
	}

}