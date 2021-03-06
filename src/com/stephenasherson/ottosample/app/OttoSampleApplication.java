/*
 * Copyright (c) 2013 Stephen Asherson
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.stephenasherson.ottosample.app;

import android.app.Application;

import com.googlecode.androidannotations.annotations.EApplication;
import com.stephenasherson.ottosample.contact.Contact;

/**
 * Simple Application class which is just used to cache a contact
 * object
 * @author Stephen Asherson.
 */
@EApplication
public class OttoSampleApplication extends Application
{
	// Cache the contact for demo purposes
	private Contact latestContact = null;

	/*
	 * Getter & Setter methods
	 */
	public Contact getLatestContact()
	{
		return latestContact;
	}

	public void setLatestContact(Contact latestContact)
	{
		this.latestContact = latestContact;
	}
}
