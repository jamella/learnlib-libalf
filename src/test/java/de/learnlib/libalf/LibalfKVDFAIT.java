/* Copyright (C) 2015 TU Dortmund
 * This file is part of LearnLib, http://www.learnlib.de/.
 *
 * LearnLib is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 3.0 as published by the Free Software Foundation.
 *
 * LearnLib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with LearnLib; if not, see
 * <http://www.gnu.de/documents/lgpl.en.html>.
 */
package de.learnlib.libalf;

import net.automatalib.words.Alphabet;
import de.learnlib.api.MembershipOracle.DFAMembershipOracle;
import de.learnlib.testsupport.it.learner.AbstractDFALearnerIT;
import de.learnlib.testsupport.it.learner.LearnerVariantList.DFALearnerVariantList;

public class LibalfKVDFAIT extends AbstractDFALearnerIT {

	@Override
	protected <I> void addLearnerVariants(Alphabet<I> alphabet, int targetSize,
			DFAMembershipOracle<I> mqOracle, DFALearnerVariantList<I> variants) {
		variants.addLearnerVariant("default", new LibalfKVDFA<I>(alphabet, mqOracle, false), targetSize);
		variants.addLearnerVariant("binary-search", new LibalfKVDFA<I>(alphabet, mqOracle, true), targetSize);
	}


}
