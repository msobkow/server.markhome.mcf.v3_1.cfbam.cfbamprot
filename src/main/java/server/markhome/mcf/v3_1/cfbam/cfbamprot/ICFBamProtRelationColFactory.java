
// Description: Java Protected Factory interface for RelationCol.

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbamprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsecprot.*;
import server.markhome.mcf.v3_1.cfint.cfintprot.*;

/*
 *	ICFBamProtRelationColFactory protected interface for RelationCol
 */
public interface ICFBamProtRelationColFactory
{

	/**
	 *	Allocate a protected primary history key for RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	ICFBamProtRelationColHPKey newProtHPKey();

	/**
	 *	Allocate a protected UNameIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a protected RelationIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByRelationIdxKey newProtByRelationIdxKey();

	/**
	 *	Allocate a protected DefSchemaIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByDefSchemaIdxKey newProtByDefSchemaIdxKey();

	/**
	 *	Allocate a protected FromColIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByFromColIdxKey newProtByFromColIdxKey();

	/**
	 *	Allocate a protected ToColIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByToColIdxKey newProtByToColIdxKey();

	/**
	 *	Allocate a protected PrevIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByPrevIdxKey newProtByPrevIdxKey();

	/**
	 *	Allocate a protected NextIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByNextIdxKey newProtByNextIdxKey();

	/**
	 *	Allocate a protected RelPrevIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByRelPrevIdxKey newProtByRelPrevIdxKey();

	/**
	 *	Allocate a protected RelNextIdx key over public RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColByRelNextIdxKey newProtByRelNextIdxKey();

	/**
	 *	Allocate a protected RelationCol interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationCol newRec();

	/**
	 *	Allocate a protected RelationCol history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFBamProtRelationColH newHRec();

}
