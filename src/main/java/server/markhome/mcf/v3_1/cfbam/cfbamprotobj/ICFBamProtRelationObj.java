// Description: Java 25 Object interface for CFBamProt Relation.

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

package server.markhome.mcf.v3_1.cfbam.cfbamprotobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;

import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprot.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;

public interface ICFBamProtRelationObj
	extends ICFBamProtScopeObj
{
	/**
	 *	Get the current edition of this Relation instance as a ICFBamProtRelationEditObj.
	 *
	 *	@return	The ICFBamProtRelationEditObj edition of this instance.
	 */
	ICFBamProtRelationEditObj getEditAsRelation();

	/**
	 *	Get the ICFBamProtRelationTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamProtRelationTableObj table cache which manages this instance.
	 */
	ICFBamProtRelationTableObj getRelationTable();

	/**
	 *	Get the ICFBamProtRelation instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ICFBamProtRelation instance which currently backs this object.
	 */
	ICFBamProtRelation getRelationRec();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamProtSchemaDefObj get$OptionalOrRequired$LookupDefSchema();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtSchemaDefObj instance referenced by the DefSchema key.
	 */
	ICFBamProtSchemaDefObj get$OptionalOrRequired$LookupDefSchema( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTableObj instance referenced by the FromTable key.
	 */
	ICFBamProtTableObj get$OptionalOrRequired$ContainerFromTable();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtTableObj instance referenced by the FromTable key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTableObj instance referenced by the FromTable key.
	 */
	ICFBamProtTableObj get$OptionalOrRequired$ContainerFromTable( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamProtRelationColObj> get$OptionalOrRequired$ComponentsColumns();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtRelationColObj array of instances referenced by the Columns key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationColObj[] array of instances referenced by the Columns key.
	 */
	List<ICFBamProtRelationColObj> get$OptionalOrRequired$ComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamProtPopTopDepObj> get$OptionalOrRequired$ComponentsPopDep();

	/**
	 *	Get the array of $optionalorrequired$ ICFBamProtPopTopDepObj array of instances referenced by the PopDep key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtPopTopDepObj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamProtPopTopDepObj> get$OptionalOrRequired$ComponentsPopDep( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the FromIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupFromIndex();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the FromIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the FromIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupFromIndex( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTableObj instance referenced by the ToTable key.
	 */
	ICFBamProtTableObj get$OptionalOrRequired$LookupToTable();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtTableObj instance referenced by the ToTable key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtTableObj instance referenced by the ToTable key.
	 */
	ICFBamProtTableObj get$OptionalOrRequired$LookupToTable( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the ToIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupToIndex();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtIndexObj instance referenced by the ToIndex key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtIndexObj instance referenced by the ToIndex key.
	 */
	ICFBamProtIndexObj get$OptionalOrRequired$LookupToIndex( boolean forceRead );

	/**
	 *	Get the $optionalorrequired$ ICFBamProtRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationObj instance referenced by the Narrowed key.
	 */
	ICFBamProtRelationObj get$OptionalOrRequired$LookupNarrowed();

	/**
	 *	Get the $optionalorrequired$ ICFBamProtRelationObj instance referenced by the Narrowed key.
	 *
	 *	@return	The $optionalorrequired$ ICFBamProtRelationObj instance referenced by the Narrowed key.
	 */
	ICFBamProtRelationObj get$OptionalOrRequired$LookupNarrowed( boolean forceRead );

	/**
	 *	Get the required ICFLibKeyHash256 attribute TableId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute TableId.
	 */
	ICFLibKeyHash256 getRequiredTableId();

	/**
	 *	Get the required ICFLibKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute Id.
	 */
	ICFLibKeyHash256 getRequiredId();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute DefSchemaId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute DefSchemaId.
	 */
	CFLibDbKeyHash256 getOptionalDefSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the required ICFBamPubSchema.RelationTypeEnum attribute RelationType.
	 *
	 *	@return	The required ICFBamPubSchema.RelationTypeEnum attribute RelationType.
	 */
	ICFBamPubSchema.RelationTypeEnum getRequiredRelationType();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The optional String attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The optional String attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Get the required ICFLibKeyHash256 attribute FromIndexId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute FromIndexId.
	 */
	ICFLibKeyHash256 getRequiredFromIndexId();

	/**
	 *	Get the required ICFLibKeyHash256 attribute ToTableId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute ToTableId.
	 */
	ICFLibKeyHash256 getRequiredToTableId();

	/**
	 *	Get the required ICFLibKeyHash256 attribute ToIndexId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute ToIndexId.
	 */
	ICFLibKeyHash256 getRequiredToIndexId();

	/**
	 *	Get the required boolean attribute IsRequired.
	 *
	 *	@return	The required boolean attribute IsRequired.
	 */
	boolean getRequiredIsRequired();

	/**
	 *	Get the required boolean attribute IsXsdContainer.
	 *
	 *	@return	The required boolean attribute IsXsdContainer.
	 */
	boolean getRequiredIsXsdContainer();

	/**
	 *	Get the required boolean attribute IsLateResolver.
	 *
	 *	@return	The required boolean attribute IsLateResolver.
	 */
	boolean getRequiredIsLateResolver();

	/**
	 *	Get the required boolean attribute AllowAddendum.
	 *
	 *	@return	The required boolean attribute AllowAddendum.
	 */
	boolean getRequiredAllowAddendum();

	/**
	 *	Get the optional CFLibDbKeyHash256 attribute NarrowedId.
	 *
	 *	@return	The optional CFLibDbKeyHash256 attribute NarrowedId.
	 */
	CFLibDbKeyHash256 getOptionalNarrowedId();

	/**
	 *	Get the required ICFBamPubSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required ICFBamPubSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	ICFBamPubSchema.CodeVisibilityEnum getRequiredCodeVis();

}
