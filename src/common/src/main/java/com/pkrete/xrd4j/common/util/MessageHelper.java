/**
 * MIT License
 *
 * Copyright (C) 2014 Petteri Kivimäki
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pkrete.xrd4j.common.util;

import com.pkrete.xrd4j.common.member.ObjectType;
import com.pkrete.xrd4j.common.member.ConsumerMember;
import com.pkrete.xrd4j.common.member.ProducerMember;
import java.util.UUID;

/**
 * This class offers some helper methods for handling ServiceRequest
 * and ServiceResponse messages.
 *
 * @author Petteri Kivimäki
 */
public class MessageHelper {

    /**
     * Constructs and initializes a new MessageHelper object. Should never
     * be used.
     */
    private MessageHelper() {
    }

    /**
     * Returns the ObjectType of the given ConsumerMember object. The object
     * type is member if subsystem code is not defined. If subsystem code
     * is defined, the object type is subsystem.
     * @param consumer the ConsumerMember object which ObjectType needs
     * to be fetched.
     * @return ObjectType of the given ConsumerMember, member or subsystem
     */
    public static ObjectType getObjectType(ConsumerMember consumer) {
        if (consumer.getSubsystemCode() == null || consumer.getSubsystemCode().isEmpty()) {
            return ObjectType.MEMBER;
        }
        return ObjectType.SUBSYSTEM;
    }

    /**
     * Returns the ObjectType of the given ProducerMember object. The object
     * type is central service if member class is not defined. If member class
     * is defined, the object type is service.
     * @param producer the ProducerMember object which ObjectType needs
     * to be fetched.
     * @return ObjectType of the given ProducerMember, central service or
     * service
     */
    public static ObjectType getObjectType(ProducerMember producer) {
        if (producer.getMemberClass() == null) {
            return ObjectType.CENTRALSERVICE;
        }
        return ObjectType.SERVICE;
    }

    /**
     * Generates a universally unique identifier and returns it as a string.
     * @return universally unique identifier as a string
     */
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    /**
     * Parses the string argument as a signed decimal integer. If parsing
     * of the string fails, zero is returned.
     * @param source a String containing the int representation to be parsed
     * @return the integer value represented by the argument in decimal
     */
    public static int strToInt(String source) {
        try {
            return Integer.parseInt(source);
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }

    /**
     * Converts the given string to boolean. The comparison is case insensitive.
     * @param source boolean value as a string
     * @return boolean value
     */
    public static boolean strToBool(String source) {
        if (source == null || source.isEmpty()) {
            return false;
        }
        if (source.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }
}
